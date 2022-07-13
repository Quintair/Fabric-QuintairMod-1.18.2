package ru.quintair.quintairmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class MushroomTinder extends Block {
    public MushroomTinder(Settings settings) {
        super(settings);
    }

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(5, 7, 11, 11, 8, 16),
            Block.createCuboidShape(4, 7, 12, 5, 8, 16),
            Block.createCuboidShape(11, 7, 12, 12, 8, 16),
            Block.createCuboidShape(6, 8, 12, 10, 9, 16),
            Block.createCuboidShape(10, 8, 13, 11, 9, 16),
            Block.createCuboidShape(5, 8, 13, 6, 9, 16),
            Block.createCuboidShape(7, 6.5, 13, 9, 7.5, 16),
            Block.createCuboidShape(9, 6.5, 14, 10, 7.5, 16),
            Block.createCuboidShape(6, 6.5, 14, 7, 7.5, 16),
            Block.createCuboidShape(6, 8.5, 14, 10, 9.5, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(5, 7, 0, 11, 8, 5),
            Block.createCuboidShape(11, 7, 0, 12, 8, 4),
            Block.createCuboidShape(4, 7, 0, 5, 8, 4),
            Block.createCuboidShape(6, 8, 0, 10, 9, 4),
            Block.createCuboidShape(5, 8, 0, 6, 9, 3),
            Block.createCuboidShape(10, 8, 0, 11, 9, 3),
            Block.createCuboidShape(7, 6.5, 0, 9, 7.5, 3),
            Block.createCuboidShape(6, 6.5, 0, 7, 7.5, 2),
            Block.createCuboidShape(9, 6.5, 0, 10, 7.5, 2),
            Block.createCuboidShape(6, 8.5, 0, 10, 9.5, 2)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(0, 7, 5, 5, 8, 11),
            Block.createCuboidShape(0, 7, 4, 4, 8, 5),
            Block.createCuboidShape(0, 7, 11, 4, 8, 12),
            Block.createCuboidShape(0, 8, 6, 4, 9, 10),
            Block.createCuboidShape(0, 8, 10, 3, 9, 11),
            Block.createCuboidShape(0, 8, 5, 3, 9, 6),
            Block.createCuboidShape(0, 6.5, 7, 3, 7.5, 9),
            Block.createCuboidShape(0, 6.5, 9, 2, 7.5, 10),
            Block.createCuboidShape(0, 6.5, 6, 2, 7.5, 7),
            Block.createCuboidShape(0, 8.5, 6, 2, 9.5, 10)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(11, 7, 5, 16, 8, 11),
            Block.createCuboidShape(12, 7, 11, 16, 8, 12),
            Block.createCuboidShape(12, 7, 4, 16, 8, 5),
            Block.createCuboidShape(12, 8, 6, 16, 9, 10),
            Block.createCuboidShape(13, 8, 5, 16, 9, 6),
            Block.createCuboidShape(13, 8, 10, 16, 9, 11),
            Block.createCuboidShape(13, 6.5, 7, 16, 7.5, 9),
            Block.createCuboidShape(14, 6.5, 6, 16, 7.5, 7),
            Block.createCuboidShape(14, 6.5, 9, 16, 7.5, 10),
            Block.createCuboidShape(14, 8.5, 6, 16, 9.5, 10)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)){
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            case EAST:
                return SHAPE_E;
            default:
                return SHAPE_N;

        }
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos.offset(state.get(FACING)));
        return blockState.isIn(BlockTags.LOGS_THAT_BURN);
    }

}
