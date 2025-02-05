
public class Main {
  public static void main(String[] args) {
    String input = "aaggbcee";

    // count
   /* Map<Character, Integer> map = new HashMap<>();
    for (char c : input.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    // sort
    List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
    list.sort((a, b) -> {
      if (!a.getValue().equals(b.getValue()))
        return b.getValue() - a.getValue();
      return a.getKey() - b.getKey();
    });

    StringBuilder result = new StringBuilder();
    for (Map.Entry<Character, Integer> entry : list) {
      result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
    }*/
    String input1 = "aaggbcee".repeat(3);

    System.out.println(String.valueOf(input).repeat(2));
  }
}