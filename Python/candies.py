class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        boolian = []
        maxcandy = max(candies)
        for candy in candies:
            if maxcandy > extraCandies+ candy:
                boolian.append(False)
            else:
                boolian.append(True)
        return boolian
            
