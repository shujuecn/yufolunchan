import buddhism.BuddhismTools;

public class TestBuddhism {
    public static void main(String[] args) {
        // 明文
        String content = "123";

        // 加密
        String encryptedContent = BuddhismTools.human2Buddhism(content, "shujuecn");
        System.out.println(encryptedContent);

        // 解密
        String decryptedContent = BuddhismTools.buddhism2Human(encryptedContent, "shujuecn");
        System.out.println(decryptedContent);
    }
}
