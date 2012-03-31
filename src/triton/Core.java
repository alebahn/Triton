package triton;

import java.awt.Image;

public class Core extends Defense {
		private int value;
		public Core(int co, Image Img, String Str){
			super(co,Img,Str);
		}
		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
}
