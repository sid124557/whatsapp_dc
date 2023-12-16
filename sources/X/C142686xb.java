package X;

/* renamed from: X.6xb  reason: invalid class name and case insensitive filesystem */
public enum C142686xb {
    A03("APPAREL_CLOTHING", "1086422341396773"),
    A0S("SHOPPING_RETAIL", "200600219953504"),
    A05("AUTOMOTIVE", "1223524174334504"),
    A0Q("RESTAURANT", "273819889375819"),
    A0C("GROCERY_STORE", "150108431712141"),
    A0N("PIZZA_PLACE", "180256082015845"),
    A0B("FOOD_BEVERAGE", "1562965077339698"),
    A09("EDUCATION", "2250"),
    A0T("SPORTS_RECREATION", "186982054657561"),
    A0G("LOCAL_SERVICE", "1758418281071392"),
    A01("ADVERTISING_MARKETING", "1757592557789532"),
    A02("AGRICULTURE", "1574325646194878"),
    A04("ARTS_ENTERTAINMENT", "133436743388217"),
    A06("BEAUTY_COSMETIC_PERSONAL_CARE", "139225689474222"),
    A07("COMMERCIAL_INDUSTRIAL", "243290832429433"),
    A08("COMMUNITY_ORGANIZATION", "152880021441864"),
    A0A("FINANCE", "1022050661163852"),
    A0D("HOTEL_LODGING", "505091123022329"),
    A0E("INTEREST", "1500"),
    A0F("LEGAL", "241113486274430"),
    A0H("MEDIA", "1314020451960517"),
    A0I("MEDIA_NEWS_COMPANY", "2233"),
    A0J("MEDICAL_HEALTH", "145118935550090"),
    A0K("NON_GOV_ORG", "2235"),
    A0L("NON_PROFIT_ORG", "2603"),
    A0O("PUBLIC_GOV_SERVICE", "147714868971098"),
    A0P("REAL_STATE", "198327773511962"),
    A0R("SCIENCE_TECH_ENGINEERING", "297544187300691"),
    A0U("TRAVEL_TRANSPORT", "128232937246338"),
    A0V("VEHICLE_AIRCRAFT_BOAT", "180410821995109"),
    A0M("OTHERS", "others");
    
    public final String id;
    public final int rootCategoryVersion;

    public static boolean A00(String str) {
        for (C142686xb r1 : values()) {
            if (r1.id.equals(str) && r1.rootCategoryVersion == 2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: public */
    C142686xb(String str, String str2) {
        this.id = str2;
        this.rootCategoryVersion = r2;
    }
}
