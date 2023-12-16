package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.R;
import com.whatsapp.SerializableLocation;
import com.whatsapp.SerializablePoint;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.5NW  reason: invalid class name */
public final class AnonymousClass5NW {
    public final View.OnClickListener A00;
    public final View A01;
    public final PopupWindow A02;

    public final boolean A00(PopupWindow.OnDismissListener onDismissListener, InteractiveAnnotation interactiveAnnotation, PhotoView photoView) {
        int i;
        Bitmap photo = photoView.getPhoto();
        if (photo == null) {
            return false;
        }
        float[] A0T = AnonymousClass4L0.A0T();
        A0T[0] = (float) photo.getWidth();
        float height = (float) photo.getHeight();
        A0T[1] = height;
        InteractiveAnnotation interactiveAnnotation2 = interactiveAnnotation;
        SerializablePoint[] serializablePointArr = interactiveAnnotation2.polygonVertices;
        SerializablePoint serializablePoint = serializablePointArr[0];
        double d = serializablePoint.x;
        double d2 = (double) A0T[0];
        double d3 = d * d2;
        double d4 = (double) height;
        double d5 = serializablePoint.y * d4;
        SerializablePoint serializablePoint2 = serializablePointArr[1];
        double d6 = serializablePoint2.x * d2;
        double d7 = serializablePoint2.y * d4;
        SerializablePoint serializablePoint3 = serializablePointArr[2];
        double d8 = serializablePoint3.x * d2;
        double d9 = d4 * serializablePoint3.y;
        SerializablePoint serializablePoint4 = serializablePointArr[3];
        double d10 = d2 * serializablePoint4.x;
        double d11 = serializablePoint4.y * d4;
        double d12 = (double) 2;
        double d13 = (d3 + d8) / d12;
        double d14 = (d5 + d9) / d12;
        if (d6 <= d13 && d13 <= d8) {
            double d15 = d6 - d8;
            if (d15 != 0.0d) {
                d14 = d7 - (((d7 - d9) * (d6 - d13)) / d15);
            }
        } else if (d8 <= d13 && d13 <= d10) {
            double d16 = d8 - d10;
            if (d16 != 0.0d) {
                d14 = d9 - (((d9 - d11) * (d8 - d13)) / d16);
            }
        } else if (d10 > d13 || d13 > d3) {
            double d17 = d3 - d6;
            if (d17 != 0.0d) {
                d14 = d5 - (((d5 - d7) * (d3 - d13)) / d17);
            }
        } else {
            double d18 = d10 - d3;
            if (d18 != 0.0d) {
                d14 = d11 - (((d11 - d5) * (d10 - d13)) / d18);
            }
        }
        float[] fArr = {(float) d13, (float) d14};
        photoView.getImageMatrix().mapPoints(fArr);
        fArr[0] = fArr[0] + ((float) photoView.getLeft());
        fArr[1] = fArr[1] + ((float) photoView.getTop());
        View rootView = photoView.getRootView();
        C162457s7.A0D(rootView);
        int i2 = (int) fArr[0];
        int i3 = (int) fArr[1];
        PopupWindow popupWindow = this.A02;
        popupWindow.setHeight(-2);
        popupWindow.setWidth(-2);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new BitmapDrawable((Resources) null, (Bitmap) null));
        popupWindow.setContentView(this.A01);
        TextView A09 = AnonymousClass002.A09(popupWindow.getContentView(), R.id.tooltip_text);
        Object obj = interactiveAnnotation2.data;
        C162457s7.A0C(obj);
        if (obj instanceof SerializableLocation) {
            i = R.string.f11nameremoved;
        } else {
            if (obj instanceof C53042mS) {
                i = R.string.f11nameremoved;
            }
            C86604Kt.A19(popupWindow.getContentView());
            C106905aM.A04(A09);
            AnonymousClass54E.A00(popupWindow.getContentView(), this, popupWindow, 19);
            popupWindow.setOnDismissListener(onDismissListener);
            popupWindow.setAnimationStyle(R.style.f12nameremoved);
            popupWindow.showAtLocation(rootView, 0, i2 - (popupWindow.getContentView().getMeasuredWidth() / 2), (int) (((float) i3) - (((float) popupWindow.getContentView().getMeasuredHeight()) * 0.82f)));
            return true;
        }
        A09.setText(i);
        C86604Kt.A19(popupWindow.getContentView());
        C106905aM.A04(A09);
        AnonymousClass54E.A00(popupWindow.getContentView(), this, popupWindow, 19);
        popupWindow.setOnDismissListener(onDismissListener);
        popupWindow.setAnimationStyle(R.style.f12nameremoved);
        popupWindow.showAtLocation(rootView, 0, i2 - (popupWindow.getContentView().getMeasuredWidth() / 2), (int) (((float) i3) - (((float) popupWindow.getContentView().getMeasuredHeight()) * 0.82f)));
        return true;
    }

    public AnonymousClass5NW(Context context, View.OnClickListener onClickListener, ViewGroup viewGroup) {
        C18260x0.A0Q(context, viewGroup);
        this.A02 = new PopupWindow(context);
        LayoutInflater A002 = C620633i.A00(context);
        C626936e.A06(A002);
        View A0R = AnonymousClass001.A0R(A002, viewGroup, R.layout.f8nameremoved);
        C162457s7.A0D(A0R);
        this.A01 = A0R;
        this.A00 = onClickListener;
    }
}
