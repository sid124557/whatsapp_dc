package X;

import android.net.Uri;
import android.util.SparseArray;
import com.facebook.bloks.common.implementations.components.imagenode.helper.BloksCompositeImageListener;
import com.facebook.bloks.common.implementations.components.imagenode.helper.BloksImageComponentHelper;
import com.facebook.bloks.common.implementations.components.imagenode.helper.CompositeImagePerfDataListener;
import com.facebook.fresco.ui.common.ImagePerfDataListener;
import com.facebook.fresco.vito.listener.ImageListener;
import com.facebook.fresco.vito.provider.FrescoVitoProvider;
import com.facebook.rendercore.fresco.FrescoRenderUnit;
import com.whatsapp.R;

/* renamed from: X.7c8  reason: invalid class name and case insensitive filesystem */
public final class C153857c8 {
    public static final C161797qU A00(C153427bI r14, AnonymousClass84O r15, Object obj) {
        AnonymousClass84O r1 = r15;
        Uri uri = BloksImageComponentHelper.getUri(r14, r15);
        ImageListener imageListener = BloksImageComponentHelper.getImageListener(r14, r15);
        ImagePerfDataListener imagePerfDataListener = BloksImageComponentHelper.getImagePerfDataListener(r14, r15);
        SparseArray sparseArray = r14.A01;
        Object obj2 = sparseArray.get(R.id.bk_context_key_image_load_listener);
        CompositeImagePerfDataListener compositeImagePerfDataListener = new CompositeImagePerfDataListener();
        if (imagePerfDataListener != null) {
            compositeImagePerfDataListener.getListeners().add(imagePerfDataListener);
        }
        if (obj2 != null) {
            compositeImagePerfDataListener.getListeners().add(obj2);
        }
        AnonymousClass6LA imageOptions = BloksImageComponentHelper.getImageOptions(r14, r15);
        boolean needsHigherSampling = BloksImageComponentHelper.getNeedsHigherSampling(r15);
        Object obj3 = obj;
        if (uri != null && (BloksImageComponentHelper.getShouldForcePrefetch(r15) || (FrescoVitoProvider.getConfig().layoutPrefetchingEnabled(obj3) && BloksImageComponentHelper.getShouldPrefetch(r15)))) {
            FrescoVitoProvider.getPrefetcher().prefetch(FrescoVitoProvider.getConfig().getPrefetchConfig().prefetchTargetOnPrepare(), uri, imageOptions, obj3, "BloksImageComponent");
        }
        C166517yo r2 = new C166517yo((C166517yo) sparseArray.get(R.id.bk_context_key_context_chain));
        long j = (long) r1.A02;
        if (compositeImagePerfDataListener.getListeners().isEmpty()) {
            compositeImagePerfDataListener = null;
        }
        return new FrescoRenderUnit(j, uri, imageListener, (ImagePerfDataListener) compositeImagePerfDataListener, imageOptions, needsHigherSampling, obj3, BloksImageComponentHelper.getRemoteContextChain(r1, r2));
    }

    public static final Object A01() {
        return new BloksCompositeImageListener();
    }
}
