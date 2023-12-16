package X;

import android.media.MediaCrypto;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import com.facebook.android.exoplayer2.util.Util;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.7oK  reason: invalid class name and case insensitive filesystem */
public final class C160797oK {
    public final MediaDrm A00;
    public final UUID A01;

    public AnonymousClass7F3 A02(String str, byte[] bArr, byte[] bArr2, int i) {
        MediaDrm.KeyRequest keyRequest = this.A00.getKeyRequest(bArr, bArr2, str, i, (HashMap) null);
        return new AnonymousClass7F3(keyRequest.getData(), keyRequest.getDefaultUrl());
    }

    public static C160797oK A00(UUID uuid) {
        try {
            return new C160797oK(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new C143766zR(e, 1);
        } catch (Exception e2) {
            throw new C143766zR(e2, 2);
        }
    }

    public AnonymousClass7F4 A03() {
        MediaDrm.ProvisionRequest provisionRequest = this.A00.getProvisionRequest();
        return new AnonymousClass7F4(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    public /* bridge */ /* synthetic */ C156297gO A04(byte[] bArr) {
        UUID uuid = this.A01;
        MediaCrypto mediaCrypto = new MediaCrypto(uuid, bArr);
        if (Util.A00 < 27 && C155567f7.A00.equals(uuid)) {
            uuid = C155567f7.A01;
        }
        return new C156297gO(mediaCrypto, uuid, bArr);
    }

    public Map A05(byte[] bArr) {
        return this.A00.queryKeyStatus(bArr);
    }

    public void A06() {
        this.A00.setPropertyString("securityLevel", "L3");
    }

    public void A07(AnonymousClass7A0 r3) {
        this.A00.setOnEventListener(new C162917sy(r3, this));
    }

    public void A08(byte[] bArr) {
        this.A00.closeSession(bArr);
    }

    public void A09(byte[] bArr) {
        this.A00.provideProvisionResponse(bArr);
    }

    public void A0A(byte[] bArr, byte[] bArr2) {
        this.A00.restoreKeys(bArr, bArr2);
    }

    public byte[] A0B() {
        return this.A00.openSession();
    }

    public byte[] A0C(byte[] bArr, byte[] bArr2) {
        if (C155567f7.A00.equals(this.A01)) {
            bArr2 = AnonymousClass70w.A00(bArr2);
        }
        return this.A00.provideKeyResponse(bArr, bArr2);
    }

    public C160797oK(UUID uuid) {
        UUID uuid2 = C155567f7.A01;
        if (!uuid2.equals(uuid)) {
            this.A01 = uuid;
            UUID uuid3 = uuid;
            if (Util.A00 < 27 && C155567f7.A00.equals(uuid)) {
                uuid3 = uuid2;
            }
            MediaDrm mediaDrm = new MediaDrm(uuid3);
            this.A00 = mediaDrm;
            if (C155567f7.A04.equals(uuid) && "ASUS_Z00AD".equals(Util.A04)) {
                mediaDrm.setPropertyString("securityLevel", "L3");
                return;
            }
            return;
        }
        throw AnonymousClass6C7.A0U("Use C.CLEARKEY_UUID instead");
    }
}
