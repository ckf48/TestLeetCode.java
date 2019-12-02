//你有一个十进制数字，请按照此规则将它变成「十六进制魔术数字」：首先将它变成字母大写的十六进制字符串，然后将所有的数字 0 变成字母 O ，将数字 1 变成字母 I 。 
//
// 如果一个数字在转换后只包含 {"A", "B", "C", "D", "E", "F", "I", "O"} ，那么我们就认为这个转换是有效的。 
//
// 给你一个字符串 num ，它表示一个十进制数 N，如果它的十六进制魔术数字转换是有效的，请返回转换后的结果，否则返回 "ERROR" 。 
//
// 
//
// 示例 1： 
//
// 输入：num = "257"
//输出："IOI"
//解释：257 的十六进制表示是 101 。
// 
//
// 示例 2： 
//
// 输入：num = "3"
//输出："ERROR"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= N <= 10^12 
// 给定字符串不会有前导 0 。 
// 结果中的所有字母都应该是大写字母。 
// 
// Related Topics 数学 字符串


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String toHexspeak(String num) {
        long number = Long.valueOf(num);
        String result = "";
        while (number != 0) {
            long m = number % 16;
            number /= 16;
            if (m == (long) 0)
                result += "O";
            else if (m == (long) 1)
                result += "I";
            else if (m == (long) 10)
                result += "A";
            else if (m == (long) 11)
                result += "B";
            else if (m == (long) 12)
                result += "C";
            else if (m == (long) 13)
                result += "D";
            else if (m == (long) 14)
                result += "E";
            else if (m == (long) 15)
                result += "F";
            else
                return "ERROR";
        }
        return new StringBuffer(result).reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
