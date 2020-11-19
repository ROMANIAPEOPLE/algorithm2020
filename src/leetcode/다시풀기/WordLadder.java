package leetcode.다시풀기;

import leetcode.DFSBFS.단어사다리;

import java.util.*;

public class WordLadder {
    public static void main(String[] args) {
        String[] words = {"hot", "dot", "lot", "log", "cog"};
        List<String> wordList = Arrays.asList(words);
        System.out.println(ladderLength_neighbor("hit", "cog", wordList));
    }

    private static int ladderLength_neighbor(String start, String end, List<String> wordList) {

        int level = 1;
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                if (word.equals(end)) return level;

                for (String words : getWords(word, wordList)) {
                    queue.add(words);
                }
            }
            level++;
        }
        return level;
    }
    private static List<String> getWords(String word, List<String> wordList) {
        List<String> res = new ArrayList<>();
        Set<String> isValid = new HashSet<>(wordList);
        for(int i=0; i<word.length(); i++){
            char [] temp = word.toCharArray();
            for(char ch ='a'; ch<='z'; ch++){
                temp[i]=ch;
                String newStr = new String(temp);
                if(isValid.remove(newStr)){
                    res.add(newStr);
                }
            }

        }
        return res;
    }
}
