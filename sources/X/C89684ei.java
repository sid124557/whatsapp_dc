package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.android.di.BaseEntryPoint;
import com.whatsapp.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: X.4ei  reason: invalid class name and case insensitive filesystem */
public abstract class C89684ei extends AnonymousClass4SG {
    public static final int A03 = -1;
    public AnonymousClass5ND A00;
    public ViewTreeObserver.OnDrawListener A01;
    public BaseEntryPoint A02;

    private void A4w(View view, C69263Wi r4) {
        r4.A02.post(new C70173a4(view, 46, this));
    }

    private boolean A53() {
        BaseEntryPoint baseEntryPoint = this.A02;
        if (baseEntryPoint == null || baseEntryPoint.Avy() == null || !this.A02.Avy().A0Y(C58422vE.A01, 4892)) {
            return false;
        }
        return true;
    }

    public int A5t() {
        return -1;
    }

    public void A5v() {
    }

    public void A5w() {
    }

    public void A5x(View view, C69263Wi r4) {
        AnonymousClass5ND r0 = this.A00;
        if (r0.A01.A0D.BI5(A5t())) {
            this.A01 = new C109935fQ(view, r4, this);
            view.getViewTreeObserver().addOnDrawListener(this.A01);
        }
    }

    public void A5y(View view, C69263Wi r3) {
        A60("onRendered");
        BKe(2);
        A4w(view, r3);
    }

    public void A60(String str) {
        this.A00.A01.A09(str);
    }

    public void A61(String str) {
        this.A00.A01.A0A(str);
    }

    public final void A62(String str, boolean z, boolean z2) {
        this.A00.A01.A0D(str, z, z2);
    }

    public void A63(short s) {
        A60("onRendered");
        BKe(s);
    }

    public boolean A64() {
        return false;
    }

    public void BKe(short s) {
        this.A00.A01.A0E(s);
    }

    public void BKj(String str) {
        this.A00.A01.A0B(str);
    }

    public void BNY() {
        this.A00.A01.A0A("data_load");
    }

    public void BQZ() {
        this.A00.A01.A09("data_load");
    }

    public void BZs() {
        this.A00.A01.A0E(230);
    }

    public AnonymousClass5JR getFirstDrawMonitor() {
        return this.A00.A00;
    }

    public AnonymousClass5ND getInteractionPerfTracker() {
        return this.A00;
    }

    public C89684ei(int i) {
        super(i);
    }

    private View A4v() {
        if (A5u().A02) {
            return AnonymousClass001.A0Q(this);
        }
        return null;
    }

    public C47122ck A5u() {
        if (!A64() || !A53()) {
            return new C47122ck(A5t());
        }
        Log.d("WaBasePerfEnabledActivity/getPerfToolsConfiguration ttrc configuration enabled");
        C47122ck r3 = new C47122ck(A5t());
        r3.A05 = true;
        String A0n = C18310x6.A0n(this);
        r3.A00 = 18;
        r3.A01 = A0n;
        r3.A06 = true;
        return r3;
    }

    public void A5z(AnonymousClass5ND r1) {
        this.A00 = r1;
    }

    public void attachBaseContext(Context context) {
        C64333Db A012 = C389229y.A01(context);
        this.A02 = (BaseEntryPoint) C389229y.A02(context, BaseEntryPoint.class);
        String A0n = C18310x6.A0n(this);
        this.A00 = new AnonymousClass5ND((C59052wG) ((AnonymousClass5F5) A012.AcK.A00.A6a.get()).A00.A01.AI3.get(), A5u(), A0n);
        super.attachBaseContext(context);
    }

    public void onCreate(Bundle bundle) {
        if (!getIntent().getBooleanExtra("key_perf_tracked", false)) {
            AnonymousClass5ND r0 = this.A00;
            int A5t = A5t();
            if (!r0.A01.A0D.BI5(A5t) && A5t != 78318969) {
                long longExtra = getIntent().getLongExtra("perf_start_time_ns", -1);
                String stringExtra = getIntent().getStringExtra("perf_origin");
                if (stringExtra == null) {
                    stringExtra = C18310x6.A0n(this);
                }
                AnonymousClass5ND r8 = this.A00;
                View A4v = A4v();
                AnonymousClass6AI r6 = new AnonymousClass6AI(this, 0);
                if (A4v != null && r8.A01.A0A.A02) {
                    AnonymousClass5JR r1 = new AnonymousClass5JR(A4v);
                    r8.A00 = r1;
                    C44952Yc r4 = new C44952Yc(r8, r6);
                    C626936e.A01();
                    C626936e.A01();
                    if (r1.A01) {
                        r4.A00();
                    } else {
                        List list = r1.A03;
                        list.add(r4);
                        AnonymousClass6A6.A00(list, 5);
                    }
                }
                if (r8.A01.A0F(stringExtra, longExtra)) {
                    getIntent().putExtra("key_perf_tracked", true);
                }
            }
        }
        super.onCreate(bundle);
    }

    public void onResume() {
        super.onResume();
    }

    public void onStart() {
        super.onStart();
    }

    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
    }

    public C89684ei() {
    }
}
