class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        int n = nums.size();
        vector<int> ans(2 * n);

        int temp = 0;
        for (int i = 0; i < 2 * n; i++) {
            if (i == n) {
                temp = 0;
            }
            ans[i] = nums[temp];
            temp++;
        }

        return ans;
    }
};
