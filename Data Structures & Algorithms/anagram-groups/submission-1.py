class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        seen = []
        result = []
        for i in range(len(strs)):
            word = strs[i]
            word = word.lower()
            wordAsList = list(word)
            wordAsList.sort()
            if wordAsList not in seen:
                seen.append(wordAsList)
                result.insert(len(seen)-1, [word])
            else:
                result[seen.index(wordAsList)].append(word)
        return result