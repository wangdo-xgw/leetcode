package com.aisino.sort;

//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
//
// 示例 1:
//
// 输入: s = "anagram", t = "nagaram"
//输出: true
//
//
// 示例 2:
//
// 输入: s = "rat", t = "car"
//输出: false
//
// 说明:
//你可以假设字符串只包含小写字母。
//
// 进阶:
//如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
// Related Topics 排序 哈希表

/**
 * @author: xuguangwu
 * @Description:
 * @date Created in 2020-10-20-上午 10:36
 */
public class YiWeiCi {
    public boolean isAnagram(String s, String t) {
        int [] letterCount = new int[26];
        for(int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i));
            System.out.println(s.charAt(i)-'a');
            letterCount[s.charAt(i)-'a']++;
        }
        for(int i=0; i<t.length(); i++){
            letterCount[t.charAt(i)-'a']--;
        }
        for(int i: letterCount)
            if(i!=0)
                return false;
            return true;
    }
    public static void main(String args[]){
        String str1="anagagnjj";
        String str2="naagagnjj";
        YiWeiCi ywc = new YiWeiCi();
        boolean b = ywc.isAnagram(str1,str2);
        System.out.println(b);
    }
}