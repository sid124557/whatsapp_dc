package X;

import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import java.util.TimerTask;

/* renamed from: X.8Tt  reason: invalid class name and case insensitive filesystem */
public class C174308Tt extends TimerTask {
    public final /* synthetic */ BusinessDirectoryActivity A00;

    public C174308Tt(BusinessDirectoryActivity businessDirectoryActivity) {
        this.A00 = businessDirectoryActivity;
    }

    public void run() {
        this.A00.runOnUiThread(new C117125rQ(this, 25));
    }
}
