package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.media.FaceDetector;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.29I  reason: invalid class name */
public class AnonymousClass29I {
    public static Pair A00(File file) {
        Log.d("mediafileutils/detection/start");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        AnonymousClass7KE A06 = C107245ax.A06(new AnonymousClass5WB(options, (Long) null, 400, 400, true), file);
        Bitmap bitmap = A06.A02;
        Pair pair = null;
        if (bitmap == null) {
            return null;
        }
        if ((bitmap.getWidth() & 1) == 1) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth() - 1, bitmap.getHeight());
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            bitmap = createBitmap;
        }
        FaceDetector faceDetector = new FaceDetector(bitmap.getWidth(), bitmap.getHeight(), 1);
        FaceDetector.Face[] faceArr = new FaceDetector.Face[1];
        Log.d("mediafileutils/detection/find");
        if (faceDetector.findFaces(bitmap, faceArr) > 0 && faceArr[0].confidence() > 0.3f) {
            PointF pointF = new PointF();
            faceArr[0].getMidPoint(pointF);
            pair = C18290x4.A0K(Integer.valueOf((int) ((pointF.x * ((float) A06.A01)) / ((float) bitmap.getWidth()))), (int) ((pointF.y * ((float) A06.A00)) / ((float) bitmap.getHeight())));
        }
        bitmap.recycle();
        Log.d("mediafileutils/detectFace/finish");
        return pair;
    }
}
