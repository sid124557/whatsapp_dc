package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.56V  reason: invalid class name */
public final class AnonymousClass56V extends C41022Iq {
    public static final ArrayList A0G = C18260x0.A0C("in stock", "out of stock");
    public static final ArrayList A0H = C18260x0.A0C("false", "true");
    public final C34801vq A00;
    public final C34801vq A01;
    public final C34801vq A02;
    public final C34801vq A03;
    public final C34801vq A04;
    public final C34821vs A05;
    public final C34821vs A06;
    public final C138896rB A07;
    public final AnonymousClass56R A08;
    public final AnonymousClass56T A09;
    public final Long A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final List A0F;

    public AnonymousClass56V(AnonymousClass36K r11) {
        AnonymousClass36K r3 = r11;
        AnonymousClass36K.A0N(r11, "product");
        Long A0U = AnonymousClass0x2.A0U();
        Long A0S = AnonymousClass0x2.A0S();
        this.A0A = (Long) C626836d.A05(r3, Long.class, A0U, A0S, (Object) null, new String[]{"max_available"}, false);
        Class<String> cls = String.class;
        this.A0E = (String) C626836d.A06(r3, cls, A0U, A0S, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "#elementValue"}, false);
        this.A0C = (String) C626836d.A06(r3, cls, A0U, 200L, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID, "#elementValue"}, false);
        this.A0D = C626836d.A09(r11, A0H, new String[]{"is_hidden"});
        this.A0B = C626836d.A09(r11, A0G, new String[]{"availability"});
        this.A09 = (AnonymousClass56T) C86614Ku.A0r(r11, new String[]{"status_info"}, 363);
        this.A07 = (C138896rB) C86614Ku.A0r(r11, new String[]{"belongs_to"}, 366);
        this.A08 = (AnonymousClass56R) C86614Ku.A0r(r11, new String[]{"image_fetch_status"}, 367);
        this.A02 = (C34801vq) C86614Ku.A0r(r11, new String[]{"price"}, 368);
        this.A00 = (C34801vq) C86614Ku.A0r(r11, new String[]{"currency"}, 369);
        this.A03 = (C34801vq) C86614Ku.A0r(r11, new String[]{"retailer_id"}, 370);
        this.A01 = (C34801vq) C86614Ku.A0r(r11, new String[]{"description"}, 371);
        this.A04 = (C34801vq) C86614Ku.A0r(r11, new String[]{"url"}, 372);
        this.A06 = (C34821vs) C86614Ku.A0r(r11, new String[]{"sale_price"}, 373);
        this.A05 = (C34821vs) C86614Ku.A0r(r11, new String[]{"max_available"}, 364);
        this.A0F = C626836d.A0B(r3, new C1896292a(365), new String[]{"media", "image"}, 1, 100);
        this.A00 = r11;
    }
}
