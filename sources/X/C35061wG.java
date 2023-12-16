package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1wG  reason: invalid class name and case insensitive filesystem */
public final class C35061wG extends C41022Iq {
    public static final ArrayList A0U = C18260x0.A0C("false", "true");
    public static final ArrayList A0V = C18260x0.A0C("false", "true");
    public static final ArrayList A0W = C18260x0.A0C("false", "true");
    public static final ArrayList A0X = C18260x0.A0C("false", "true");
    public static final ArrayList A0Y = C18260x0.A0C("false", "true");
    public final AnonymousClass36K A00;
    public final C138956rH A01;
    public final C34801vq A02;
    public final AnonymousClass56S A03;
    public final C34841vu A04;
    public final C34841vu A05;
    public final C34821vs A06;
    public final C34821vs A07;
    public final C34821vs A08;
    public final C34891vz A09;
    public final Long A0A;
    public final Long A0B;
    public final Long A0C;
    public final Long A0D;
    public final Long A0E;
    public final Long A0F;
    public final Long A0G;
    public final Long A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final List A0T;

    public C35061wG(AnonymousClass36K r20) {
        AnonymousClass36K r5 = r20;
        AnonymousClass36K.A0N(r5, "promotion");
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        Class<String> cls = String.class;
        Long A0R2 = AnonymousClass0x2.A0R();
        Long A0S2 = AnonymousClass0x2.A0S();
        this.A0I = (String) C626836d.A06(r5, cls, A0R2, A0S2, (Object) null, strArr, false);
        this.A0J = (String) C626836d.A05(r5, cls, A0R2, A0S2, (Object) null, new String[]{"instance_id"}, false);
        this.A0S = (String) C626836d.A06(r5, cls, A0R2, A0S2, (Object) null, new String[]{"title", "#elementValue"}, false);
        this.A0R = (String) C626836d.A06(r5, cls, A0R2, A0S2, (Object) null, new String[]{"text", "#elementValue"}, false);
        this.A0Q = (String) C626836d.A06(r5, cls, A0R2, A0S2, (Object) null, new String[]{"qp_config", "template_name"}, false);
        Class<Long> cls2 = Long.class;
        AnonymousClass36K r12 = r5;
        Long l = A0R2;
        Long l2 = A0S2;
        this.A0F = (Long) C626836d.A06(r12, cls2, l, l2, (Object) null, new String[]{"qp_config", "start_time_seconds"}, false);
        this.A0B = (Long) C626836d.A06(r12, cls2, l, l2, (Object) null, new String[]{"qp_config", "end_time_seconds"}, false);
        this.A0H = (Long) C626836d.A06(r12, cls2, l, l2, (Object) null, new String[]{"qp_config", "ttl_seconds"}, false);
        this.A0G = (Long) C626836d.A06(r12, cls2, l, l2, (Object) null, new String[]{"qp_config", "surface_delay_time_seconds"}, false);
        this.A0M = (String) C626836d.A05(r5, cls, A0R2, A0S2, (Object) null, new String[]{"qp_config", "experiment_key"}, false);
        this.A0D = (Long) C626836d.A06(r12, cls2, l, l2, (Object) null, new String[]{"qp_config", "max_impressions"}, false);
        this.A0C = (Long) C626836d.A06(r12, cls2, l, l2, (Object) null, new String[]{"qp_config", "impression_cooldown"}, false);
        this.A0A = (Long) C626836d.A06(r12, cls2, l, l2, (Object) null, new String[]{"qp_config", "eligibility_duration_ms"}, false);
        this.A0E = (Long) C626836d.A06(r12, cls2, l, l2, (Object) null, new String[]{"qp_config", "priority"}, false);
        this.A0L = C41022Iq.A00(r5, "qp_config", "dismissable", A0V);
        this.A0O = C41022Iq.A00(r5, "qp_config", "force_pass", A0X);
        this.A0K = C41022Iq.A00(r5, "qp_config", "deterministic", A0U);
        this.A0N = C41022Iq.A00(r5, "qp_config", "exposure_holdout", A0W);
        this.A0P = C41022Iq.A00(r5, "qp_config", "log_eligibility_waterfall", A0Y);
        this.A02 = (C34801vq) C626836d.A08(r5, new String[]{"header"}, 99);
        this.A03 = (AnonymousClass56S) C626836d.A08(r5, new String[]{"image"}, 102);
        this.A04 = (C34841vu) C626836d.A08(r5, new String[]{"primary_action"}, 103);
        this.A05 = (C34841vu) C626836d.A08(r5, new String[]{"secondary_action"}, 104);
        this.A09 = (C34891vz) C626836d.A08(r5, new String[]{"colors"}, 105);
        this.A06 = (C34821vs) C626836d.A08(r5, new String[]{"content_attributes"}, 106);
        this.A07 = (C34821vs) C626836d.A08(r5, new String[]{"qp_config", "filter_rules"}, 107);
        this.A08 = (C34821vs) C626836d.A08(r5, new String[]{"qp_config", "instance_log_data"}, C627136h.A03);
        this.A01 = (C138956rH) C626836d.A08(r5, new String[]{"qp_config", "pacing"}, 109);
        this.A0T = C626836d.A0B(r5, C86304Jp.A00(100), new String[]{"qp_config", "triggers", "trigger"}, 1, 50);
        this.A00 = r5;
        this.A00 = (AnonymousClass36K) C626836d.A0B(r5, C86304Jp.A00(101), new String[]{"qp_config"}, 1, 1).get(0);
    }
}
