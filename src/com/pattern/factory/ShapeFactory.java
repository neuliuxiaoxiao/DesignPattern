package com.pattern.factory;

public class ShapeFactory extends AbstractFactory{

	public Shape getShape(String shapeType){
		 if(shapeType == null){
	         return null;
	      }
		 if(shapeType.equalsIgnoreCase("CIRCLE")){
			 return new Circle();
		 }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
		 return null;
	}
	/**
	 * 
	* @Description: 使用反射机制可以解决每次增加一个产品时，都需要增加一个对象实现工厂的缺点
	* @date 2018年2月26日 上午9:14:47 
	* @author liuxi
	 */
	 @SuppressWarnings("unchecked")
	public static <T> T getClass(Class<? extends T> clazz) {
		 T obj = null;
		 try {
			obj = (T)Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		 return obj;
	 }
	@Override
	Color getColor(String color) {
		return null;
	}
}
