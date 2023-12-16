package X;

import com.whatsapp.AbstractConsumerAppShell;

/* renamed from: X.1EY  reason: invalid class name */
public abstract class AnonymousClass1EY extends AbstractConsumerAppShell implements AnonymousClass4GJ {
    public final AnonymousClass3YW componentManager = new AnonymousClass3YW(new AnonymousClass2ER(this));
    public boolean injected = false;

    public final Object generatedComponent() {
        return this.componentManager.generatedComponent();
    }

    public void hiltInternalInject() {
        if (!this.injected) {
            this.injected = true;
            generatedComponent();
        }
    }

    public final AnonymousClass3YW componentManager() {
        return this.componentManager;
    }

    public void onCreate() {
        hiltInternalInject();
        super.onCreate();
    }
}
