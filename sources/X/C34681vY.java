package X;

import org.json.JSONObject;

/* renamed from: X.1vY  reason: invalid class name and case insensitive filesystem */
public final class C34681vY extends C60942zQ {
    public C69263Wi A00;
    public final AnonymousClass2VL A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34681vY(AnonymousClass2VL r8, C69263Wi r9, C56612sH r10, C50672ia r11, C183538qC r12, C183538qC r13, C183538qC r14, C183538qC r15) {
        super(r10, r11, r12, r13, r14, r15);
        C18260x0.A0f(r10, r9, r11, r12, r13);
        C18260x0.A0W(r14, r15, r8);
        this.A00 = r9;
        this.A01 = r8;
    }

    public /* bridge */ /* synthetic */ JSONObject A01(C60272yH r3, Object obj, JSONObject jSONObject) {
        C43322Rr r4 = (C43322Rr) obj;
        C162457s7.A0J(r4, 2);
        jSONObject.put("target_account_type", r4.A00);
        jSONObject.put("opaque_target_accounts_to_be_linked_strings", r4.A04.toString());
        jSONObject.put("linking_entry_point", r4.A01);
        jSONObject.put("family_device_id", r4.A02);
        jSONObject.put("selected_age_account", r4.A03);
        return jSONObject;
    }
}
