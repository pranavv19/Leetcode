class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int cnt1 = 0, cnt2 = 0;
        int elem1 = Integer.MIN_VALUE, elem2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem1) {
                cnt1++;
            } else if (arr[i] == elem2) {
                cnt2++;
            } else if (cnt1 == 0) {
                elem1 = arr[i];
                cnt1 = 1;
            } else if (cnt2 == 0) {
                elem2 = arr[i];
                cnt2 = 1;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem1) {
                cnt1++;
            } else if (arr[i] == elem2) {
                cnt2++;
            }
        }

        List<Integer> ls = new ArrayList<>();
        int n = arr.length;
        if (cnt1 > n / 3) 
        ls.add(elem1);
        if (cnt2 > n / 3)
        ls.add(elem2);

        return ls;
    }
}
