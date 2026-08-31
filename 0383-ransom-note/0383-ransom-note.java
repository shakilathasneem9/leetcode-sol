class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map = new HashMap<>();

        // Count characters in magazine
        for (char ch : magazine.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Check ransomNote characters
        for (char ch : ransomNote.toCharArray()) {

            int count = map.getOrDefault(ch, 0);

            if (count == 0) {
                return false;
            }

            map.put(ch, count - 1);
        }

        return true;
    }
}