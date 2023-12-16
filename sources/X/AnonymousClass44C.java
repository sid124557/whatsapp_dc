package X;

import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.44C  reason: invalid class name */
public final class AnonymousClass44C extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C003203q $activity;
    public final /* synthetic */ AnonymousClass4GP $callback;
    public final /* synthetic */ int $noticeId;
    public final /* synthetic */ C45992au this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass44C(C003203q r2, C45992au r3, AnonymousClass4GP r4, int i) {
        super(1);
        this.$callback = r4;
        this.this$0 = r3;
        this.$activity = r2;
        this.$noticeId = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C45992au r6;
        AnonymousClass4GP r5;
        C003203q r4;
        Integer num;
        WeakReference weakReference;
        AnonymousClass21D r0;
        WeakReference A14;
        C89654ea r1;
        int A02 = C18320x8.A02((AnonymousClass21D) obj, 0);
        if (A02 != 0) {
            if (A02 != 1) {
                if (A02 == 2) {
                    r6 = this.this$0;
                    r4 = this.$activity;
                    int i = this.$noticeId;
                    r5 = this.$callback;
                    try {
                        boolean A05 = r6.A02.A05(i);
                        C18260x0.A1D("GenAiPrivacyLauncher/isAccepted, was accepted ", AnonymousClass001.A0o(), A05);
                        if (A05) {
                            r0 = AnonymousClass21D.TRUE;
                        } else {
                            r0 = AnonymousClass21D.FALSE;
                        }
                    } catch (IllegalArgumentException unused) {
                        Log.i("GenAiPrivacyLauncher/isAccepted, Error getting disclosure state");
                        r0 = AnonymousClass21D.ERROR;
                    }
                    int ordinal = r0.ordinal();
                    if (ordinal == 0) {
                        r5.invoke();
                    } else if (ordinal == 1) {
                        weakReference = AnonymousClass0x9.A14(r4);
                        num = Integer.valueOf(i);
                    } else if (ordinal != 2) {
                        A14 = AnonymousClass0x9.A14(r4);
                    } else {
                        Log.i("GenAiPrivacyLauncher/handleDownload invalid state");
                    }
                } else if (A02 == 3) {
                    A14 = AnonymousClass0x9.A14(this.$activity);
                }
                Object obj2 = A14.get();
                if ((obj2 instanceof C89654ea) && (r1 = (C89654ea) obj2) != null) {
                    r1.Bot(R.string.f11nameremoved);
                }
            } else {
                r6 = this.this$0;
                r4 = this.$activity;
                int i2 = this.$noticeId;
                r5 = this.$callback;
                weakReference = AnonymousClass0x9.A14(r4);
                num = Integer.valueOf(i2);
            }
            AnonymousClass32F.A00(r4, AnonymousClass5W0.A05, new AnonymousClass3S6(r5, new C80653ya(r6, weakReference)), num, (String) null);
        } else {
            this.$callback.invoke();
        }
        return C59022wD.A00;
    }
}
