package leetcode.DFSBFS;

//시작에서 끝까지 도달할때, 문자열을 하나씩만 바꾸면서 총 몇회만에 end까지 도달할 수 있는지 구하기.

import java.util.Arrays;
import java.util.*;

public class WordLadder {

    public static void main(String[] args) {
        String[] words = {"hot","dot","lot","log","cog"};
//		String[] words = {"hot","dot","dog","lot","log"};
        List<String> wordList = Arrays.asList(words);
//		Set<String> dict = new HashSet<>(wordList);
        WordLadder a = new WordLadder();
        System.out.println(a.ladderLength_neighbor("hit","cog", wordList));
    }

    public int ladderLength_neighbor(String beginWord, String endWord, List<String> wordList) {
        if (wordList == null || !wordList.contains(endWord))
            return 0;

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String str = queue.poll();
                if (str.equals(endWord))
                    return level;
                for (String neighbor : neighbors(str, wordList)) {
                    queue.offer(neighbor);
                }
            }
            level++;
        }

        return 0;
    }

    public List<String> neighbors(String s, List<String> wordList) {

        List<String> res = new LinkedList<>();
        Set<String> dict = new HashSet<>(wordList);
        for (int i = 0; i < s.length(); i++) {
            char[] chars = s.toCharArray();
            for (char ch = 'a'; ch <= 'z'; ch++) {
                chars[i] = ch;// ait~zit
                String word = new String(chars);
                if (dict.remove(word)) {
                    res.add(word);
                }
            }
        }
        return res;
    }
}