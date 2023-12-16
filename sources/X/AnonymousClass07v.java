package X;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.07v  reason: invalid class name */
public class AnonymousClass07v extends AnonymousClass0Q4 {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ C08310eF A01;
    public final /* synthetic */ AnonymousClass09I A02;

    public AnonymousClass07v(FrameLayout frameLayout, C08310eF r2, AnonymousClass09I r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = frameLayout;
    }

    public void A00(Bundle bundle, View view, C08310eF r7, C08270df r8) {
        if (r7 == this.A01) {
            CopyOnWriteArrayList copyOnWriteArrayList = r8.A0X.A01;
            synchronized (copyOnWriteArrayList) {
                int size = copyOnWriteArrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (((AnonymousClass0L9) copyOnWriteArrayList.get(i)).A00 == this) {
                        copyOnWriteArrayList.remove(i);
                        break;
                    } else {
                        i++;
                    }
                }
            }
            AnonymousClass09I.A00(view, this.A00);
        }
    }
}
