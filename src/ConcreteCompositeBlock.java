import java.util.List;

import java.util.List;

interface CompositeBlock extends Block {
    List<Block> getBlocks();
}

public class ConcreteCompositeBlock implements CompositeBlock {
    private List<Block> blocks;
    private String color;
    private String material;


    public ConcreteCompositeBlock(List<Block> blocks, String color, String material) {
        this.blocks = blocks;
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public List<Block> getBlocks() {
        return blocks;
    }
}


