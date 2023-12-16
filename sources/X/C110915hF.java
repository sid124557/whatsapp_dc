package X;

import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.modelmanager.metadataloader.ARModelMetadataDownloader;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.5hF  reason: invalid class name and case insensitive filesystem */
public final class C110915hF implements ARModelMetadataDownloader {
    public final C101535Fd A00;
    public final AnonymousClass4B1 A01;

    public void downloadModelMetadata(List list, AnonymousClass32L r19, C202269lf r20) {
        List<ARModelMetadataRequest> list2 = list;
        C202269lf r4 = r20;
        C18260x0.A0P(list2, r4);
        HashMap hashMap = new HashMap(list2.size());
        for (ARModelMetadataRequest aRModelMetadataRequest : list2) {
            VersionedCapability capability = aRModelMetadataRequest.getCapability();
            C162457s7.A0D(capability);
            hashMap.put(capability, aRModelMetadataRequest);
        }
        String[] strArr = new String[2];
        strArr[0] = ARRequestAsset$CompressionMethod.TAR_BROTLI.getCompressionMethod();
        C108575dD r9 = new C108575dD((String) null, (String) null, (List) null, (List) null, (List) null, AnonymousClass0x9.A19(ARRequestAsset$CompressionMethod.NONE.getCompressionMethod(), strArr, 1), new int[0]);
        AbstractCollection abstractCollection = (AbstractCollection) C18300x5.A0d(C100845Cm.A02);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C57692u3.A01(abstractCollection));
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            C193199Nn r2 = (C193199Nn) it.next();
            linkedHashMap.put(r2.A01.name(), String.valueOf(r2.A00));
        }
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A0q = AnonymousClass000.A0q(hashMap);
        while (A0q.hasNext()) {
            String name = ((VersionedCapability) AnonymousClass001.A0w(A0q).getKey()).name();
            A0s.add(new C108515d7(name, C18320x8.A0e(name, linkedHashMap)));
        }
        C202269lf r7 = r4;
        this.A01.B03(new C115215oJ(this, r9, A0s)).Bh4(new C114485n7(r7, this, list2, hashMap, hashMap.size()));
    }

    public C110915hF(C101535Fd r1, AnonymousClass4B1 r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
