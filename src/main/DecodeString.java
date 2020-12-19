package main;

/**
 * 字符串解码
 * 给定一个经过编码的字符串，返回它解码后的字符串。
 * <p>
 * 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
 * <p>
 * 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
 * <p>
 * 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4]的输入。
 */
public class DecodeString {
    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        decodeString(res, s, 0);
        return res.toString();
    }

    private int decodeString(StringBuilder res, String s, int start) {
        while (start < s.length()) {
            char c = s.charAt(start);
            if (c == ']') {
                start++;
                break;
            }
            if (c >= 'a' && c <= 'z') {
                res.append(c);
                start++;
            } else {
                StringBuilder count = new StringBuilder();
                while (start < s.length() && s.charAt(start) >= '0' && s.charAt(start) <= '9') {
                    count.append(s.charAt(start));
                    start++;
                }
                StringBuilder str = new StringBuilder();
                start = decodeString(str, s, start + 1);

                for (int j = 0; j < Integer.parseInt(count.toString()); j++) {
                    res.append(str);
                }
            }
        }
        return start;
    }
}
