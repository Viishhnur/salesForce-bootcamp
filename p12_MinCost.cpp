#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int minCost(vector<vector<int>> costs){
    int minCost = 0;
    vector<int>dp = {0,0,0};
    for(int i=0;i<costs.size();i++){
        int dp0 = costs[i][0] + min(dp[1],dp[2]);
        int dp1 = costs[i][1] + min(dp[0],dp[2]);
        int dp2 = costs[i][2] + min(dp[0],dp[1]);
        dp.clear();
        dp.push_back(dp0);
        dp.push_back(dp1);
        dp.push_back(dp2);
        
    }

    return *min_element(dp.begin(),dp.end());
}
int main(){

    vector<vector<int>> costs = {
        {17,2,7},
        {16,16,5},
        {14,3,19} 
    };

    cout << minCost(costs);


    return 0;
}