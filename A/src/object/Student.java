package object;

public class Student {

			public boolean equals(Object  obj){
				if( this == obj ){
					return true ;
				}
				if( obj instanceof Student){
					
						Student stu =(Student)obj;
						
						if(stu.name.equals(this.name)
								&&stu.address.equals(this.address)
								&&stu.phone.equals(this.phone)){
							return true;
						}
						
					}
				return false;
				}
			private String name;
			private String address;
			private String phone;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public String getPhone() {
				return phone;
			}
			public void setPhone(String phone) {
				this.phone = phone;
			}
		}
