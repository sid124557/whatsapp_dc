package X;

import com.whatsapp.AlarmService;

/* renamed from: X.4T5  reason: invalid class name */
public abstract class AnonymousClass4T5 extends C005105f implements AnonymousClass4GJ {
    public boolean A00 = false;
    public final Object A01 = AnonymousClass002.A0D();
    public volatile AnonymousClass3YV A02;

    public final Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new AnonymousClass3YV(this);
                }
            }
        }
        return this.A02.generatedComponent();
    }

    public void onCreate() {
        if (!this.A00) {
            this.A00 = true;
            AlarmService alarmService = (AlarmService) this;
            C22031Ec r2 = (C22031Ec) ((C64323Da) generatedComponent());
            alarmService.A00 = C86614Ku.A0d(r2.A06);
            alarmService.A01 = C72343dZ.A00(r2.A04);
        }
        super.onCreate();
    }
}
