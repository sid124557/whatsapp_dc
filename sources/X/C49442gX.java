package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.os.Build;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;

/* renamed from: X.2gX  reason: invalid class name and case insensitive filesystem */
public class C49442gX {
    public final C620633i A00;
    public final AnonymousClass33p A01;
    public final AnonymousClass4FV A02;
    public final AnonymousClass4FS A03;

    public void A00() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.A03.BkM(C69983Zk.A00(this, 4));
        }
    }

    public final void A01() {
        ActivityManager A06 = this.A00.A06();
        if (A06 == null) {
            Log.e("Android11ExitReasonReporter Could not get activity manager");
            return;
        }
        ListIterator listIterator = A06.getHistoricalProcessExitReasons((String) null, 0, 100).listIterator();
        ArrayList A0s = AnonymousClass001.A0s();
        HashMap A0t = AnonymousClass001.A0t();
        AnonymousClass33p r4 = this.A01;
        long A0A = AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(r4), "last_exit_reason_sync_timestamp");
        while (listIterator.hasNext()) {
            ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) listIterator.next();
            if (applicationExitInfo.getTimestamp() <= A0A) {
                break;
            }
            A0s.add(applicationExitInfo);
            Integer valueOf = Integer.valueOf(applicationExitInfo.getReason());
            int i = 1;
            if (A0t.containsKey(valueOf)) {
                i = AnonymousClass001.A0K(A0t.get(valueOf)) + 1;
            }
            AnonymousClass0x2.A1I(valueOf, A0t, i);
        }
        ListIterator listIterator2 = A0s.listIterator(A0s.size());
        while (listIterator2.hasPrevious()) {
            ApplicationExitInfo applicationExitInfo2 = (ApplicationExitInfo) listIterator2.previous();
            C25391aR r2 = new C25391aR();
            r2.A00 = Boolean.valueOf(ActivityManager.isLowMemoryKillReportSupported());
            r2.A01 = C18330xA.A07(applicationExitInfo2.getPss());
            r2.A04 = AnonymousClass0x9.A0m(applicationExitInfo2.getReason());
            r2.A07 = applicationExitInfo2.getDescription();
            r2.A05 = Long.valueOf(applicationExitInfo2.getTimestamp());
            r2.A02 = C18330xA.A07(applicationExitInfo2.getRss());
            r2.A06 = AnonymousClass0x9.A0m(applicationExitInfo2.getStatus());
            r2.A03 = AnonymousClass0x9.A0m(applicationExitInfo2.getImportance());
            try {
                InputStream traceInputStream = applicationExitInfo2.getTraceInputStream();
                if (traceInputStream != null) {
                    while (C18310x6.A0Z(traceInputStream).readLine() != null) {
                    }
                }
            } catch (IOException e) {
                Log.e("Android11ExitReasonReporter/could not get exit info", e);
            }
            this.A02.BhD(r2);
            C18260x0.A0M(r4, "last_exit_reason_sync_timestamp", applicationExitInfo2.getTimestamp());
        }
        AnonymousClass1XH r22 = new AnonymousClass1XH();
        r22.A01 = A0t.toString();
        r22.A00 = Long.valueOf(AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(r4), "last_exit_reason_sync_timestamp"));
        this.A02.BhD(r22);
    }

    public C49442gX(C620633i r1, AnonymousClass33p r2, AnonymousClass4FV r3, AnonymousClass4FS r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }
}
