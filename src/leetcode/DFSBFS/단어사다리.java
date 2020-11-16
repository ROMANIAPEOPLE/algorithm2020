package leetcode.DFSBFS;

import java.util.*;

public class 단어사다리 {
    public static void main(String[] args) {
        String[] words = {"hot", "dot", "lot", "log", "cog"};
        List<String> wordList = Arrays.asList(words);
        단어사다리 a = new 단어사다리();
        System.out.println(a.ladderLength_neighbor("hit", "cog", wordList));
    }

    private int ladderLength_neighbor(String begin, String end, List<String> wordList) {
        if (wordList == null || !wordList.contains(end)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        Set<String> set = new HashSet<>(wordList);

        queue.offer(begin);

        int level =1;

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i<size; i++) {
                String str = queue.poll();
                if(str.equals(end)) {
                    return level;
                }

                for(String word : getWords(wordList,str)) {
                    queue.add(word);
                }

            }
            level++;
        }



        return 0;
    }

    private List<String> getWords(List<String> wordList, String str) {
        List<String> res = new ArrayList<>(); // a~z까지 담은 리스트
        Set<String> set = new HashSet<>(wordList); //wordList를 담은 set (제거 편하게 하기 위한)

        for(int i=0; i<str.length(); i++){
            char [] chars = str.toCharArray();
            for(char ch ='a'; ch<='z'; ch++) {
                chars[i] = ch;
                String newStr  = new String(chars);
                if(set.remove(newStr)) {
                    res.add(newStr);
                }
            }
        }
        return res;

    }


}
