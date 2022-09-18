
public abstract class GeometricFigure {
		private String objectName; 
		
		public GeometricFigure (){
			this("Geometric Figure");
		}
		
		public GeometricFigure(String objectName) {
			this.objectName=objectName;
		}
		
		public String getObjectName() {
			return objectName;
		}

		public abstract double findArea();
		
		public String toString () {
			return "Object name: "+getObjectName();
		}
		
		public boolean equalArea (GeometricFigure o) {
			if (findArea()==o.findArea()) 
				return true;
			else 
					return false;
			
		}

	}

