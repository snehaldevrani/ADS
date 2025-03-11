#include <bits/stdc++.h>
using namespace std;
// Find the Kth Smallest Element in an Unsorted Array

int main(){
    int n;
    cin>>n;

    vector<int> arr(n);

    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    int k;
    cin>>k;

    sort(arr.begin(),arr.end());

    cout<<arr[k-1];  // time complexity = O(n log n);


}