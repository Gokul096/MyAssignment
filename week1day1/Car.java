package week1day1;
 
	public class Car 
	{
		public void ApplyBreak()
		{
			System.out.println("Apply Break");
		}
		public void ApplyGear()
		{
			System.out.println("Apply Gear");
		}
		public void SwitchOnAc()
		{
			System.out.println("Switch On Ac");
		}
		public void ApplyAccelerate()
		{
			System.out.println("Apply Accelerate");        
		}
		public void SwitchOnWiper()
		{
			System.out.println("Switch On Wiper");
		}
		public void ApplyClutch()
		{
			System.out.println("Apply Clutch");
		}
		public void SwitchOnHeadLight()
		{
			System.out.println("Switch On Head Light");
		}
		public void OpenSunRoof()
		{
		System.out.println("Open Sun Roof");	
		}
		public void SwitchOnIndicator()
		{
			System.out.println("Switch On Indicator");
		}
		public void WearSearBelt()
		{
			System.out.println("Wear Sear Belt");
		}
		public static void main(String[] args) 
		{
			Car myCar=new Car();
			myCar.ApplyBreak();
			myCar.ApplyGear();
			myCar.SwitchOnAc();
			myCar.ApplyAccelerate();
			myCar.ApplyClutch();
			myCar.SwitchOnWiper();
			myCar.WearSearBelt();
			myCar.OpenSunRoof();
			myCar.SwitchOnHeadLight();
			myCar.SwitchOnIndicator();
		}
	}

