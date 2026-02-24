public class A4Exercises {

	/*
	 * Purpose: gets the number of horses in the given list
	 * Parameters: List hList - the list of horses
	 * Returns: int - the number of horses in the given list
	 */
	public static int horseCount(List hList) {
		return hList.size();
	}
		
	/*
	 * Purpose: get the number of horses into the list h is
	 * Parameters: List hList - the list of horses
	 *             Horse h - the horse to find
	 * Returns: int - the distance the first occurrence of 
	 *                h is from the start of the list, or 
	 *                -1 if h is not found in hList
	 */
	public static int distanceAway(List hList, Horse h) {
		return hList.find(h);
	}
	
	/*
	 * Purpose: gets an array containing the names of all horses in the list
	 * Parameters: List hList - the list of horses
	 * Returns: String[] - the names of all the horses in hList
	 */
	public static String[] horseNames(List hList) {
		String[] horses = new String[hList.size()];

		for (int i = 0; i < hList.size(); i++) {
			horses[i] = hList.get(i).getName();
		}

		return horses;
	}
	
		/*
	 * Purpose: get the distance the tallest horse is 
	 *          from the start of the list
	 * Parameters: List hList - the list of horses
	 * Returns: int - the distance the tallest horse
	 *                is from the start of the list,
	 *                -1 if the list is empty
	 */
	public static int distanceToTallest(List hList) {
		int tallestIndex = -1;
		if (hList.size() != 0) {
			tallestIndex = 0;
			Horse tallestHorse = hList.get(0);

		for (int i = 1; i < hList.size(); i++) {
			if (hList.get(i).getHeight() > tallestHorse.getHeight()) {
				tallestHorse = hList.get(i);
				tallestIndex = i;
				}
			}

		}
		
		return tallestIndex;
	}
	
	/*
	 * Purpose: gets the name of the tallest horse in the given list
	 * Parameters: List hList - the list of horses
	 * Returns: String - the name of the tallest horse, or the
     *                   name of the horse closest to front in a tie
	 *                   Returns "" if no horses are in the list
	 */
	public static String tallestHorse(List hList) {
		int tallestIndex = distanceToTallest(hList);
		if (tallestIndex == -1) {
			return "";
		} else {
			return hList.get(tallestIndex).getName();
		}
	}
	
	/*
	 * Purpose: get the number of horses visible 
	 *          from the beginning of the list 
	 * Parameters: List hList - the list of horses
	 * Returns: int - the number of horses visible
	 * 
	 * Note: Read through the assignment PDF for more information
	 *       (and watch the accompanying video, it's a work of art!)
	 */
	public static int numberVisible(List hList) {
		int visibleCount = 0;
		if (hList.size() != 0) {
			visibleCount = 1;
			Horse tallestHorse = hList.get(0);
			for (int i = 1; i < hList.size(); i++) {
				if (hList.get(i).getHeight() > tallestHorse.getHeight()) {
					tallestHorse = hList.get(i);	
					visibleCount++;
				}
			}
		}
		return visibleCount; 
	}
		


}