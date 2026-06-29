class Solution:
    def findBuildings(self, heights: List[int]) -> List[int]:
        max = heights[-1]
        viewList = [len(heights)-1]
        for i in reversed(range(len(heights)-1)):
            if(heights[i] > max):
                viewList.insert(0, i)
                max = heights[i]
        return viewList