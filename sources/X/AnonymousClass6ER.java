package X;

import android.view.ScaleGestureDetector;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;

/* renamed from: X.6ER  reason: invalid class name */
public class AnonymousClass6ER extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ C91234j9 A00;

    public AnonymousClass6ER(C91234j9 r1) {
        this.A00 = r1;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        CallGridViewModel callGridViewModel = this.A00.A06;
        if (callGridViewModel != null) {
            callGridViewModel.A0V.A05++;
        }
    }
}
