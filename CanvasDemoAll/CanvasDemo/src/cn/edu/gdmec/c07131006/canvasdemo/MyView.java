package cn.edu.gdmec.c07131006.canvasdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class MyView extends View {

	public MyView(Context context) {
		super(context);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		canvas.drawColor(Color.GRAY);
		
		Paint paint = new Paint();
		
		paint.setColor(Color.BLACK);
		canvas.drawCircle( 100, 100, 40, paint);
		
		paint.setColor(Color.BLUE);
		paint.setStrokeWidth(10);
		canvas.drawRect(new Rect(200, 200, 400, 400), paint);
		
		paint.setColor(Color.CYAN);
		paint.setStrokeWidth(20);
		canvas.drawRect(new Rect(100, 100, 200, 200), paint);
		
		paint.setColor(Color.GREEN);
		paint.setTextSize(40);
		canvas.drawText("ÄãºÃ", 100, 100, paint);
		
	}
	

}
