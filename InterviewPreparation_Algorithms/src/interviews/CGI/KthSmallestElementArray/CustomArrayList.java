package interviews.CGI.KthSmallestElementArray;

public class CustomArrayList {

	private Integer[] array;

	private int modeCount = 0;
	
	 private int size;
	 protected transient int modCount = 0;
	 
	 transient Object[] elementData;

	public CustomArrayList() {

		array = new Integer[10];

	}

	private int arrayResizePolicy() {

		return array.length / 2;

	}

	public void add(int item) {

		if (!isArrayResizable()) {

			this.array[modeCount++] = item;

		} else {

			array = resizeArray();

			this.array[modeCount++] = item;

		}

	}

	public Integer[] resizeArray() {

		Integer newArray[] = new Integer[array.length + arrayResizePolicy()];

		System.arraycopy(array, 0, newArray, 0, modeCount);

		return newArray;

	}

	private boolean isArrayResizable() {

		if (modeCount >= Math.round(array.length * 0.75)) {

			return true;

		}

		return false;

	}
	
	 private String outOfBoundsMsg(int index) {
	        return "Index: "+index+", Size: "+size;
	    }
	
	private void rangeCheck(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
//	@SuppressWarnings("unchecked")
//    E elementData(int index) {
//        return (E) elementData[index];
//    }
//	
//	public E remove(int index) {
//        rangeCheck(index);
//
//        modCount++;
//        E oldValue = elementData(index);
//
//        int numMoved = size - index - 1;
//        if (numMoved > 0)
//            System.arraycopy(elementData, index+1, elementData, index,
//                             numMoved);
//        elementData[--size] = null; // clear to let GC do its work
//
//        return oldValue;
//    }

}