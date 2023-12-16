package X;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.WaEditText;
import java.util.List;

/* renamed from: X.9Y1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9Y1 implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass97B A00;
    public final /* synthetic */ List A01;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AnonymousClass97B r4 = this.A00;
        List<WaEditText> list = this.A01;
        if (!(motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 1)) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            Point point = new Point(((int) x) + iArr[0], ((int) y) + iArr[1]);
            for (WaEditText waEditText : list) {
                if (AnonymousClass4Rn.A01(point, waEditText) && waEditText.A08(point)) {
                    r4.A06(waEditText);
                    return true;
                }
            }
            if (motionEvent.getY() < 0.0f) {
                return true;
            }
        }
        r4.A01.A0I.onTouch(view, motionEvent);
        return false;
    }

    public /* synthetic */ AnonymousClass9Y1(AnonymousClass97B r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }
}
