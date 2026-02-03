package basics;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        //System.out.println("Git + Eclipse connected!");
		
		String a = "Hello";
		String b = "Hello";
		System.out.println(a==b);
		//a is having a stack lets say 1001 and we store the string "Hello" in the string pool, now when we declare b as "Hello" again java recognises the value and to avoid duplicasy it assigns the same stack 1001 hence it is true 
		static void change(int[] a) {
		    a[0] = 5;
		    a = new int[]{7,7,7};
		}

		int[] nums = {1,2,3};
		change(nums);
		System.out.println(nums[0]);
		
		/*This prints 5.

Before the function call, nums stores address 5001,
and heap at 5001 contains {1,2,3}.

When change(nums) is called, Java passes a COPY of the reference (5001),
so both nums and a point to the same heap object.

When we do a[0] = 5, we modify the object stored at heap address 5001,
so the heap becomes {5,2,3}. This change is visible through nums.

Next, a = new int[]{7,7,7} creates a NEW array at a different address (say 6001),
and only the local variable 'a' now points to 6001.

nums still points to the original 5001.

After the method finishes, the stack frame for 'a' is destroyed,
so nums still refers to {5,2,3}.

Therefore, nums[0] prints 5.
		 */

		    }
		}
	
