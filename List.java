public interface List {

	/* 
	 * Purpose: add h to the back of the list
	 * Parameters: Horse h - the rock to add
	 * Returns: nothing
	 * Precondition: h is not null
	 */
	public void add(Horse h);
		
	/* 
	 * Purpose: get the current size of the list
	 * Parameters: none
	 * Returns: int - number of horses in the list
	 */
	public int size(); 
			
	/* 
	 * Purpose: gets the index of the given horse in this list
	 * Parameters: Horse h - the horse to find the index of
	 * Returns: int - the index of h in this list, or -1 if not found
	 */
	public int find(Horse h);
	
	/* 
	 * Purpose: gets the horse at the given index in the list
	 * Parameters: int index - the index of the horse to access
	 * Returns: Horse - the horse at the given index
	 * Precondition: 0 <= index < size()
	 */
	public Horse get(int index);
	
}