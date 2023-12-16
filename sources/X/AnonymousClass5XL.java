package X;

import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* renamed from: X.5XL  reason: invalid class name */
public class AnonymousClass5XL {
    public int A00 = 100;
    public int A01 = 1000;
    public AnonymousClass54O A02;
    public AnonymousClass55L A03;
    public C33301sm A04;
    public AnonymousClass5XE A05;
    public AnonymousClass7DD A06;
    public boolean A07 = true;
    public final C69263Wi A08;
    public final C56972sr A09;
    public final AnonymousClass49P A0A;
    public final AnonymousClass5IP A0B;
    public final C64773Ex A0C;
    public final C56602sG A0D;
    public final C29421in A0E;
    public final AnonymousClass5ZU A0F;
    public final C56612sH A0G;
    public final C56762sW A0H;
    public final C55422qK A0I;
    public final AnonymousClass1VX A0J;
    public final C66493Lq A0K;
    public final C55702qm A0L;
    public final C29241iV A0M;
    public final C84904Ee A0N;
    public final C29281iZ A0O;
    public final C56572sD A0P;
    public final AnonymousClass4FS A0Q;
    public final AnonymousClass4F0 A0R;
    public final C29111iI A0S;
    public final C185958uW A0T;
    public final C97094xc A0U;

    public static /* synthetic */ void A00(AnonymousClass5XL r13, List list) {
        String str;
        if (list == null) {
            str = "CallsHistoryDataSource/notifyCallItemsUpdated task result null";
        } else {
            AnonymousClass7DD r1 = r13.A06;
            if (r1 != null) {
                ArrayList A0J2 = AnonymousClass002.A0J(list);
                Log.i("CallsHistoryViewModel/onCallLogUpdated");
                CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r1.A00;
                if (callsHistoryFragmentV2ViewModel.A0G || callsHistoryFragmentV2ViewModel.A0I) {
                    callsHistoryFragmentV2ViewModel.A0I = false;
                    C18290x4.A1L(callsHistoryFragmentV2ViewModel.A09);
                    AnonymousClass7D9 r4 = callsHistoryFragmentV2ViewModel.A0M;
                    Lock lock = callsHistoryFragmentV2ViewModel.A0r;
                    LinkedHashMap linkedHashMap = callsHistoryFragmentV2ViewModel.A0q;
                    ArrayList arrayList = callsHistoryFragmentV2ViewModel.A0o;
                    C56572sD r10 = callsHistoryFragmentV2ViewModel.A0k;
                    C64773Ex r7 = callsHistoryFragmentV2ViewModel.A0Y;
                    C66493Lq r9 = callsHistoryFragmentV2ViewModel.A0g;
                    AnonymousClass55I r3 = new AnonymousClass55I(r4, callsHistoryFragmentV2ViewModel, callsHistoryFragmentV2ViewModel.A0V, r7, callsHistoryFragmentV2ViewModel.A0e, r9, r10, A0J2, arrayList, linkedHashMap, lock);
                    callsHistoryFragmentV2ViewModel.A09 = r3;
                    r3.A02.executeOnExecutor(callsHistoryFragmentV2ViewModel.A0B, new Void[0]);
                    return;
                }
                str = "CallsHistoryViewModel/onCallLogUpdated skip due to no active observer";
            } else {
                return;
            }
        }
        Log.i(str);
    }

    public void A01() {
        Log.d("CallsHistoryDataSource/refreshCalls");
        if (this.A03 != null) {
            Log.d("CallsHistoryDataSource/cancelRefreshCalls");
            this.A03.A0D(true);
        }
        AnonymousClass55L r1 = new AnonymousClass55L(this);
        this.A03 = r1;
        C86614Ku.A1R(r1, this.A0Q);
    }

    public void A02() {
        C18290x4.A1L(this.A04);
        C33301sm r1 = new C33301sm(this);
        this.A04 = r1;
        C18270x1.A0w(r1, this.A0Q);
    }

    public AnonymousClass5XL(C69263Wi r13, C56972sr r14, AnonymousClass49P r15, AnonymousClass5IP r16, C64773Ex r17, C29421in r18, AnonymousClass5ZU r19, C56612sH r20, C56762sW r21, C55422qK r22, AnonymousClass1VX r23, C66493Lq r24, C29241iV r25, C29281iZ r26, C56572sD r27, AnonymousClass4FS r28, C29111iI r29, C97094xc r30) {
        AnonymousClass6BQ r6 = new AnonymousClass6BQ(this, 0);
        this.A0R = r6;
        C1237769s r4 = new C1237769s(this, 1);
        this.A0T = r4;
        AnonymousClass681 A002 = AnonymousClass681.A00(this, 7);
        this.A0D = A002;
        AnonymousClass4IE r2 = new AnonymousClass4IE(this, 0);
        this.A0N = r2;
        AnonymousClass901 r1 = new AnonymousClass901(this, 1);
        this.A0L = r1;
        AnonymousClass1VX r5 = r23;
        this.A0J = r5;
        C97094xc r0 = r30;
        this.A0U = r0;
        C29111iI r7 = r29;
        this.A0S = r7;
        this.A0H = r21;
        this.A0C = r17;
        C29421in r11 = r18;
        this.A0E = r11;
        this.A08 = r13;
        this.A0K = r24;
        this.A0I = r22;
        C29281iZ r9 = r26;
        this.A0O = r9;
        C29241iV r10 = r25;
        this.A0M = r10;
        this.A0B = r16;
        this.A0P = r27;
        this.A0G = r20;
        this.A0F = r19;
        this.A0Q = r28;
        this.A09 = r14;
        this.A0A = r15;
        r0.A06(r4);
        r7.A06(r6);
        r11.A06(A002);
        if (C627436k.A0I(r5)) {
            r9.A06(r2);
            r10.A06(r1);
        }
        if (r5.A0X(4119)) {
            this.A01 = r5.A0N(4120);
            this.A00 = r5.A0N(4284);
        }
    }
}
