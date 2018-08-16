package flatau.krissini.de.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

class GameView extends SurfaceView {

    private SurfaceHolder surfaceHolder;
    private Bitmap bitmap;

    @SuppressLint("WrongCall")public GameView(Context context) {
        super(context);
        surfaceHolder = getHolder();
        surfaceHolder.addCallback(new SurfaceHolder.Callback() {

            public void surfaceDestroyed(SurfaceHolder holder) {

            }

            public void surfaceCreated(SurfaceHolder holder) {
                Canvas theCanvas = surfaceHolder.lockCanvas(null);
                onDraw(theCanvas);
                surfaceHolder.unlockCanvasAndPost(theCanvas);
            }

            public void surfaceChanged(SurfaceHolder holder, int format,
                                       int width, int height) {
                // TODO Auto-generated method stub

            }
        });
        bmp = BitmapFactory.decodeResource(getResources(),
                R.drawable.ic_launcher);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.DKGRAY);
        canvas.drawBitmap(bmp, 25, 66, null);
    }

}
