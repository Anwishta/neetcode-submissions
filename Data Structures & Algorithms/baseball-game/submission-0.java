class Solution
{
    public int calPoints(String[] operations) 
    {
        List<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(operations[0]));
        int ans = 0;

        for(int i = 1; i < operations.length; i++)
        {
            if(operations[i].equals("C") && i >= 1)
            {
                list.remove(list.size() - 1);
            }
            else if(operations[i].equals("D") && i >= 1)
            {
                list.add(list.get(list.size()-1) * 2);
            }
            else if(operations[i].equals("+") && i >= 2)
            {
                list.add(list.get(list.size()-1) + list.get(list.size()-2));
            }
            else
            {
                list.add(Integer.parseInt(operations[i]));
            }
        }

        for(int i = 0; i < list.size(); i++)
        {
            ans += list.get(i);
        }
        return ans;
    }
}