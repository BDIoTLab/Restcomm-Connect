/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2014, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 *
 */
	
package org.restcomm.connect.testsuite.provisioning.number.voxbone;


/**
 * @author jean.deruelle@telestax.com
 *
 */
public class VoxboneIncomingPhoneNumbersEndpointTestUtils {
    public static String purchaseNumberSuccessResponse = "";
    public static String deleteNumberSuccessResponse = "";
    
    public static final String listCountries = "{\"countries\":[{\"countryCodeA3\":\"ARG\",\"countryName\":\"ARGENTINA\",\"phoneCode\":54,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"AUS\",\"countryName\":\"AUSTRALIA\",\"phoneCode\":61,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"AUT\",\"countryName\":\"AUSTRIA\",\"phoneCode\":43,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"BHR\",\"countryName\":\"BAHRAIN\",\"phoneCode\":973,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"BEL\",\"countryName\":\"BELGIUM\",\"phoneCode\":32,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"BRA\",\"countryName\":\"BRAZIL\",\"phoneCode\":55,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"BGR\",\"countryName\":\"BULGARIA\",\"phoneCode\":359,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"CAN\",\"countryName\":\"CANADA\",\"phoneCode\":1,\"hasStates\":true,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"CHL\",\"countryName\":\"CHILE\",\"phoneCode\":56,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"CHN\",\"countryName\":\"CHINA\",\"phoneCode\":86,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"COL\",\"countryName\":\"COLOMBIA\",\"phoneCode\":57,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"HRV\",\"countryName\":\"CROATIA\",\"phoneCode\":385,\"hasStates\":false,\"hasRegulationRequirement\":true},{\"countryCodeA3\":\"CYP\",\"countryName\":\"CYPRUS\",\"phoneCode\":357,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"CZE\",\"countryName\":\"CZECH REPUBLIC\",\"phoneCode\":420,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"DNK\",\"countryName\":\"DENMARK\",\"phoneCode\":45,\"hasStates\":false,\"hasRegulationRequirement\":true},{\"countryCodeA3\":\"DOM\",\"countryName\":\"DOMINICAN REPUBLIC\",\"phoneCode\":1,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"SLV\",\"countryName\":\"EL SALVADOR\",\"phoneCode\":503,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"EST\",\"countryName\":\"ESTONIA\",\"phoneCode\":372,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"FIN\",\"countryName\":\"FINLAND\",\"phoneCode\":358,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"FRA\",\"countryName\":\"FRANCE\",\"phoneCode\":33,\"hasStates\":false,\"hasRegulationRequirement\":true},{\"countryCodeA3\":\"GEO\",\"countryName\":\"GEORGIA\",\"phoneCode\":995,\"hasStates\":false,\"hasRegulationRequirement\":true},{\"countryCodeA3\":\"DEU\",\"countryName\":\"GERMANY\",\"phoneCode\":49,\"hasStates\":false,\"hasRegulationRequirement\":true},{\"countryCodeA3\":\"GRC\",\"countryName\":\"GREECE\",\"phoneCode\":30,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"HKG\",\"countryName\":\"HONG KONG\",\"phoneCode\":852,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"HUN\",\"countryName\":\"HUNGARY\",\"phoneCode\":36,\"hasStates\":false,\"hasRegulationRequirement\":true},{\"countryCodeA3\":\"IRL\",\"countryName\":\"IRELAND\",\"phoneCode\":353,\"hasStates\":false,\"hasRegulationRequirement\":true},{\"countryCodeA3\":\"ISR\",\"countryName\":\"ISRAEL\",\"phoneCode\":972,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"ITA\",\"countryName\":\"ITALY\",\"phoneCode\":39,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"JPN\",\"countryName\":\"JAPAN\",\"phoneCode\":81,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"LVA\",\"countryName\":\"LATVIA\",\"phoneCode\":371,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"LTU\",\"countryName\":\"LITHUANIA\",\"phoneCode\":370,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"LUX\",\"countryName\":\"LUXEMBOURG\",\"phoneCode\":352,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"MYS\",\"countryName\":\"MALAYSIA\",\"phoneCode\":60,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"MLT\",\"countryName\":\"MALTA\",\"phoneCode\":356,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"MEX\",\"countryName\":\"MEXICO\",\"phoneCode\":52,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"NLD\",\"countryName\":\"NETHERLANDS\",\"phoneCode\":31,\"hasStates\":false,\"hasRegulationRequirement\":true},{\"countryCodeA3\":\"NZL\",\"countryName\":\"NEW ZEALAND\",\"phoneCode\":64,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"NOR\",\"countryName\":\"NORWAY\",\"phoneCode\":47,\"hasStates\":false,\"hasRegulationRequirement\":true},{\"countryCodeA3\":\"PAN\",\"countryName\":\"PANAMA\",\"phoneCode\":507,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"PER\",\"countryName\":\"PERU\",\"phoneCode\":51,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"POL\",\"countryName\":\"POLAND\",\"phoneCode\":48,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"PRT\",\"countryName\":\"PORTUGAL\",\"phoneCode\":351,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"PRI\",\"countryName\":\"PUERTO RICO\",\"phoneCode\":1,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"ROU\",\"countryName\":\"ROMANIA\",\"phoneCode\":40,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"SGP\",\"countryName\":\"SINGAPORE\",\"phoneCode\":65,\"hasStates\":false,\"hasRegulationRequirement\":true},{\"countryCodeA3\":\"SVK\",\"countryName\":\"SLOVAKIA\",\"phoneCode\":421,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"SVN\",\"countryName\":\"SLOVENIA\",\"phoneCode\":386,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"ZAF\",\"countryName\":\"SOUTH AFRICA\",\"phoneCode\":27,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"KOR\",\"countryName\":\"SOUTH KOREA\",\"phoneCode\":82,\"hasStates\":false,\"hasRegulationRequirement\":true},{\"countryCodeA3\":\"ESP\",\"countryName\":\"SPAIN\",\"phoneCode\":34,\"hasStates\":false,\"hasRegulationRequirement\":true},{\"countryCodeA3\":\"SWE\",\"countryName\":\"SWEDEN\",\"phoneCode\":46,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"CHE\",\"countryName\":\"SWITZERLAND\",\"phoneCode\":41,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"TUR\",\"countryName\":\"TURKEY\",\"phoneCode\":90,\"hasStates\":false,\"hasRegulationRequirement\":true},{\"countryCodeA3\":\"GBR\",\"countryName\":\"UNITED KINGDOM\",\"phoneCode\":44,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"USA\",\"countryName\":\"UNITED STATES\",\"phoneCode\":1,\"hasStates\":true,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"VEN\",\"countryName\":\"VENEZUELA\",\"phoneCode\":58,\"hasStates\":false,\"hasRegulationRequirement\":false},{\"countryCodeA3\":\"VIR\",\"countryName\":\"VIRGIN ISLANDS (U.S.)\",\"phoneCode\":1,\"hasStates\":false,\"hasRegulationRequirement\":false}],\"resultCount\":57}";
    public static final String orderingCartSuccessResponse = "{\"cart\":{\"cartIdentifier\":30007,\"customerReference\":null,\"description\":null,\"dateAdded\":\"2015-04-22 18:55:45\",\"orderProducts\":null}}";
    public static final String purchaseOrderingCartSuccessResponse = "{\"cart\":{\"cartIdentifier\":30018,\"customerReference\":null,\"description\":null,\"dateAdded\":\"2015-04-22 20:14:09\",\"orderProducts\":null}}";
    public static final String addToCartSuccessResponse = "{\"status\":\"SUCCESS\"}";
    public static final String checkoutCartSuccessResponse = "{\"status\":\"SUCCESS\",\"productCheckoutList\":[{\"productType\":\"DID\",\"status\":\"SUCCESS\",\"orderReference\":\"62252DS997341\",\"message\":null}]}";
    public static final String inventoryDidSuccessResponse = "{\"dids\":[{\"didId\":6798794,\"e164\":\"+16418470436\",\"type\":\"GEOGRAPHIC\",\"countryCodeA3\":\"USA\",\"cityName\":\"ACKLEY\",\"areaCode\":\"641\",\"voiceUriId\":null,\"faxUriId\":null,\"smsLinkGroupId\":null,\"orderReference\":\"62252DS997341\",\"channels\":0,\"delivery\":\"BE\",\"trunkId\":null,\"capacityGroupId\":null,\"didGroupId\":22073,\"regulationAddressId\":null,\"srvLookup\":false,\"callerId\":{\"cliFormat\":\"E164\",\"cliValue\":\"\"},\"cliPrivacy\":\"DISABLED\",\"otherOptions\":{\"t38Enabled\":\"false\",\"dtmf\":\"RFC2833\",\"dtmfInbandMute\":\"false\",\"codecs\":[\"G711A\",\"G711U\",\"G729\"]},\"ringback\":\"STANDARD\",\"dnisEnabled\":\"false\",\"blockOrdinary\":false,\"blockCellular\":false,\"blockPayphone\":false,\"smsOutbound\":false,\"webRtc\":false}],\"resultCount\":1}";
    public static final String updateDidSuccessResponse = "{\"messages\":[{\"configOption\":\"VOICE\",\"numberUpdated\":1}]}";
    public static final String cancelDidSuccessResponse = "{\"numberCancelled\":1}";
    public static String jSonResultPurchaseNumber = "{\"sid\":\"PN*\",\"account_sid\":\"ACae6e420f425248d6a26948c17a9e2acf\",\"friendly_name\":\"6798794\",\"phone_number\":\"+16418470436\",\"voice_url\":\"http://demo.telestax.com/docs/voice.xml\",\"voice_method\":\"GET\",\"voice_fallback_url\":null,\"voice_fallback_method\":\"POST\",\"status_callback\":null,\"status_callback_method\":\"POST\",\"voice_caller_id_lookup\":false,\"voice_application_sid\":null,\"date_created\":\"*\",\"date_updated\":\"*\",\"sms_url\":null,\"sms_method\":\"POST\",\"sms_fallback_url\":null,\"sms_fallback_method\":\"POST\",\"sms_application_sid\":null,\"ussd_url\":null,\"ussd_method\":\"POST\",\"ussd_fallback_url\":null,\"ussd_fallback_method\":\"POST\",\"ussd_application_sid\":null,\"refer_url\":null,\"refer_method\":null,\"refer_application_sid\":null,\"capabilities\":{\"voice_capable\":false,\"sms_capable\":false,\"mms_capable\":false,\"fax_capable\":false},\"api_version\":\"2012-04-24\",\"uri\":\"/restcomm/2012-04-24/Accounts/ACae6e420f425248d6a26948c17a9e2acf/IncomingPhoneNumbers/PN*.json\"}";
    public static String jSonResultDeletePurchaseNumber = "{\"sid\":\"PN*\",\"account_sid\":\"ACae6e420f425248d6a26948c17a9e2acf\",\"friendly_name\":\"My Company Line\",\"phone_number\":\"+34911067000\",\"voice_url\":\"http://demo.telestax.com/docs/voice.xml\",\"voice_method\":\"GET\",\"voice_fallback_url\":null,\"voice_fallback_method\":\"POST\",\"status_callback\":null,\"status_callback_method\":\"POST\",\"voice_caller_id_lookup\":false,\"voice_application_sid\":null,\"date_created\":\"*\",\"date_updated\":\"*\",\"sms_url\":null,\"sms_method\":\"POST\",\"sms_fallback_url\":null,\"sms_fallback_method\":\"POST\",\"sms_application_sid\":null,\"capabilities\":{\"voice_capable\":false,\"sms_capable\":false,\"mms_capable\":false,\"fax_capable\":false},\"api_version\":\"2012-04-24\",\"uri\":\"/restcomm/2012-04-24/Accounts/ACae6e420f425248d6a26948c17a9e2acf/IncomingPhoneNumbers/PN*.json\"}";
    public static String jSonResultUpdatePurchaseNumber = "{\"sid\":\"PN*\",\"account_sid\":\"ACae6e420f425248d6a26948c17a9e2acf\",\"friendly_name\":\"My Company Line\",\"phone_number\":\"+33911067000\",\"voice_url\":\"http://demo.telestax.com/docs/voice.xml\",\"voice_method\":\"GET\",\"voice_fallback_url\":null,\"voice_fallback_method\":\"POST\",\"status_callback\":null,\"status_callback_method\":\"POST\",\"voice_caller_id_lookup\":false,\"voice_application_sid\":null,\"date_created\":\"*\",\"date_updated\":\"*\",\"sms_url\":null,\"sms_method\":\"POST\",\"sms_fallback_url\":null,\"sms_fallback_method\":\"POST\",\"sms_application_sid\":null,\"capabilities\":{\"voice_capable\":false,\"sms_capable\":false,\"mms_capable\":false,\"fax_capable\":false},\"api_version\":\"2012-04-24\",\"uri\":\"/restcomm/2012-04-24/Accounts/ACae6e420f425248d6a26948c17a9e2acf/IncomingPhoneNumbers/PN*.json\"}";
    public static String jSonResultUpdateSuccessPurchaseNumber = "{\"sid\":\"PN*\",\"account_sid\":\"ACae6e420f425248d6a26948c17a9e2acf\",\"friendly_name\":\"My Company Line\",\"phone_number\":\"+33911067000\",\"voice_url\":\"http://demo.telestax.com/docs/voice2.xml\",\"voice_method\":\"POST\",\"voice_fallback_url\":null,\"voice_fallback_method\":\"POST\",\"status_callback\":null,\"status_callback_method\":\"POST\",\"voice_caller_id_lookup\":false,\"voice_application_sid\":null,\"date_created\":\"*\",\"date_updated\":\"*\",\"sms_url\":\"http://demo.telestax.com/docs/sms2.xml\",\"sms_method\":\"POST\",\"sms_fallback_url\":null,\"sms_fallback_method\":\"POST\",\"sms_application_sid\":null,\"capabilities\":{\"voice_capable\":false,\"sms_capable\":false,\"mms_capable\":false,\"fax_capable\":false},\"api_version\":\"2012-04-24\",\"uri\":\"/restcomm/2012-04-24/Accounts/ACae6e420f425248d6a26948c17a9e2acf/IncomingPhoneNumbers/PN*.json\"}";
    public static String jSonResultAccountAssociatedPurchaseNumber = "{\"sid\":\"PN*\",\"account_sid\":\"ACae6e420f425248d6a26948c17a9e2acf\",\"friendly_name\":\"My Company Line\",\"phone_number\":\"+14216902867\",\"voice_url\":\"http://demo.telestax.com/docs/voice.xml\",\"voice_method\":\"GET\",\"voice_fallback_url\":null,\"voice_fallback_method\":\"POST\",\"status_callback\":null,\"status_callback_method\":\"POST\",\"voice_caller_id_lookup\":false,\"voice_application_sid\":null,\"date_created\":\"*\",\"date_updated\":\"*\",\"sms_url\":null,\"sms_method\":\"POST\",\"sms_fallback_url\":null,\"sms_fallback_method\":\"POST\",\"sms_application_sid\":null,\"capabilities\":{\"voice_capable\":false,\"sms_capable\":false,\"mms_capable\":false,\"fax_capable\":false},\"api_version\":\"2012-04-24\",\"uri\":\"/restcomm/2012-04-24/Accounts/ACae6e420f425248d6a26948c17a9e2acf/IncomingPhoneNumbers/PN*.json\"}";
    public static String jSonResultAccountAssociatedPurchaseNumberResult = "{\"sid\":\"PN*\",\"account_sid\":\"ACae6e420f425248d6a26948c17a9e2acf\",\"friendly_name\":\"My*Company Line\",\"phone_number\":\"+1*6902867\",\"voice_url\":\"http://demo.telestax.com/docs/voice*.xml\",\"voice_method\":\"*\",\"voice_fallback_url\":null,\"voice_fallback_method\":\"POST\",\"status_callback\":null,\"status_callback_method\":\"POST\",\"voice_caller_id_lookup\":false,\"voice_application_sid\":null,\"date_created\":\"*\",\"date_updated\":\"*\",\"sms_url\":*,\"sms_method\":\"POST\",\"sms_fallback_url\":null,\"sms_fallback_method\":\"POST\",\"sms_application_sid\":null,\"capabilities\":{\"voice_capable\":false,\"sms_capable\":false,\"mms_capable\":false,\"fax_capable\":false},\"api_version\":\"2012-04-24\",\"uri\":\"/restcomm/2012-04-24/Accounts/ACae6e420f425248d6a26948c17a9e2acf/IncomingPhoneNumbers/PN*.json\"}";

    public static boolean match(String text, String pattern)
    {
        text = text.trim();
        pattern = pattern.trim();
        // Create the cards by splitting using a RegEx. If more speed 
        // is desired, a simpler character based splitting can be done.
        String [] cards = pattern.split("\\*");
 
        // Iterate over the cards.
        for (String card : cards)
        {
            int idx = text.indexOf(card);
 
            // Card not detected in the text.
            if(idx == -1)
            {
                return false;
            }
 
            // Move ahead, towards the right of the text.
            text = text.substring(idx + card.length());
        }
 
        return true;
    }
}
