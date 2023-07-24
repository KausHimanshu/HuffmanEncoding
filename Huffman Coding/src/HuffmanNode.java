public class HuffmanNode {
    int freq;
    char val;
    Huffman left;
    Huffman right;

    public HuffmanNode(char val, int freq){
        this.freq = freq;
        this.val = val;
        this.left = null;
        this.right = null;
    }

}
