package X;

import android.content.Context;
import android.content.res.AssetManager;
import com.facebook.cameracore.mediapipeline.arclass.common.ARClass;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig;
import com.facebook.cameracore.mediapipeline.arengineservices.whatsapp.WhatsAppEffectServiceHost;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig;
import com.facebook.cameracore.mediapipeline.engine.AREngineController;
import com.facebook.cameracore.mediapipeline.engine.provider.whatsapp.WhatsAppPluginConfigProvider;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.9Tc  reason: invalid class name and case insensitive filesystem */
public class C194499Tc {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass9P9 A04;
    public AREngineController A05;
    public final Context A06;
    public final AssetManager A07;
    public final AndroidAsyncExecutorFactory A08;
    public final AndroidAsyncExecutorFactory A09;
    public final AnonymousClass9LD A0A;
    public volatile EffectServiceHost A0B;

    public final synchronized AREngineController A01() {
        AREngineController aREngineController;
        aREngineController = this.A05;
        if (aREngineController == null) {
            aREngineController = new AREngineController(this.A07, this.A08, this.A09, new WhatsAppPluginConfigProvider(((WhatsAppEffectServiceHost) A00()).context));
            this.A05 = aREngineController;
        }
        return aREngineController;
    }

    public final synchronized void A02() {
        if (this.A0B != null) {
            this.A0B.destroy();
            this.A0B = null;
        }
    }

    public EffectServiceHost A00() {
        if (this.A0B == null) {
            synchronized (this) {
                if (this.A0B == null) {
                    AnonymousClass9P9 r4 = this.A04;
                    Context applicationContext = this.A06.getApplicationContext();
                    C162457s7.A0J(applicationContext, 0);
                    AnonymousClass9MS r2 = r4.A00;
                    r2.A00 = new FaceTrackerDataProviderConfig(true);
                    this.A0B = new WhatsAppEffectServiceHost(applicationContext, new EffectServiceHostConfig(r2), r4.A03, new ARClass(0), r4.A02, r4.A01);
                }
            }
        }
        return this.A0B;
    }

    public C194499Tc(Context context, AnonymousClass9P9 r3, AnonymousClass9LD r4, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
        this.A0A = r4;
        this.A06 = context;
        this.A07 = context.getResources().getAssets();
        this.A08 = new AndroidAsyncExecutorFactory(scheduledExecutorService);
        this.A09 = new AndroidAsyncExecutorFactory(scheduledExecutorService2);
        this.A04 = r3;
    }

    public void finalize() {
        A02();
        super.finalize();
    }
}
