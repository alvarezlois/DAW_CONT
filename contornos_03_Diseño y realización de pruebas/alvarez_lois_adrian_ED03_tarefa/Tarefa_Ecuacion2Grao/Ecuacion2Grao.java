public class Ecuacion2Grao {
	int a;
	int b;
	int c;
	int nsols=-1;

	public Ecuacion2Grao(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}

	double[] soluciona() throws Ec2GraoException {
		double[] s=new double[2];
		int radix=b*b-4*a*c;
		if (radix < 0) throw new Ec2GraoException();
		if (a==0) {
			if (b==0) throw new Ec2GraoException();
			s[0]=-((double)c)/b;
			s[1]=0;
			nsols=1;
		} else {
			s[0]=(-b+Math.sqrt(radix))/2*a;
			s[1]=(-b-Math.sqrt(radix))/2*a;
			nsols=2;
		}
		return s;
	}

	int getNSols() throws Ec2GraoException {
		if (nsols<0) throw new Ec2GraoException();
		return nsols;
	}
}
