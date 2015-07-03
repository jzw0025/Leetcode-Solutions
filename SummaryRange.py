class Solution:
    # @param {integer[]} nums
    # @return {string[]}

    def summaryRanges(self, nums):
        res = []
        if len(nums)==0:
            return res
        start = nums[0]
        end = nums[0]
        for i in xrange(len(nums)):
            if i < len(nums)-1:
                if nums[i+1] == nums[i]+1:
                    end = nums[i+1]
                    continue
                if start == end:
                    res.append(str(start))
                    start = nums[i+1]
                    end = nums[i+1]
                else:
                    res.append(str(start) + "->" + str(end))
                    start = nums[i+1]
                    end = nums[i+1]
            else:
                if nums[i] == nums[i-1]+1:
                    print start
                    print end
                    res.append(str(start) + "->" + str(end))
                else:
                    res.append(str(start))
        return res
               

              
a = [0,1]
b=Solution().summaryRanges(a)                  
print b                
                 
                