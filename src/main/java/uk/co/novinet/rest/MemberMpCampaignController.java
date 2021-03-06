package uk.co.novinet.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.co.novinet.service.member.MemberMpCampaign;
import uk.co.novinet.service.member.MemberMpCampaignService;

@RestController
public class MemberMpCampaignController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MemberMpCampaignController.class);

    @Autowired
    private MemberMpCampaignService service;

    @CrossOrigin
    @GetMapping(path = "/membermpcampaign")
    public DataContainer getMps(MemberMpCampaign member,
            @RequestParam(value = "page", required = false) Long current,
            @RequestParam(value = "rows", required = false) Long rowCount,
            @RequestParam(value = "searchPhrase", required = false) String searchPhrase,
            @RequestParam(value = "sidx", required = false) String sortBy,
            @RequestParam(value = "sord", required = false) String sortDirection,
            @RequestParam(value = "operator", required = false) String operator) {
        return retrieveData(current, rowCount, searchPhrase, sortBy, sortDirection, member, operator == null ? "and" : operator);
    }

    @CrossOrigin
    @PostMapping(path = "/membermpcampaign/update")
    public ResponseEntity update(
            @RequestParam("id") Long id,
            @RequestParam(value = "allowEmailShareStatus", required = false) String allowEmailShareStatus,
            @RequestParam(value = "sentInitialEmail", required = false) String sentInitialEmail,
            @RequestParam(value = "campaignNotes", required = false) String campaignNotes,
            @RequestParam(value = "meetingNext", required = false) String meetingNext,
            @RequestParam(value = "meetingCount", required = false) Integer meetingCount,
            @RequestParam(value = "telephoneCount", required = false) Integer telephoneCount,
            @RequestParam(value = "writtenCount", required = false) Integer writtenCount,
            @RequestParam(value = "involved", required=false) Integer involved
    ) {
        service.update(
                id,
                allowEmailShareStatus,
                sentInitialEmail,
                campaignNotes,
                meetingNext,
                meetingCount,
                telephoneCount,
                writtenCount,
                involved
        );
        return new ResponseEntity(HttpStatus.OK);
    }


    private DataContainer retrieveData(Long current, Long rowCount, String searchPhrase, String sortBy, String sortDirection, MemberMpCampaign member, String operator) {
        current = current == null ? 1 : current;
        rowCount = rowCount == null ? 25 : rowCount;

        LOGGER.info("mp: {}", member);
        LOGGER.info("current: {}", current);
        LOGGER.info("rowCount: {}", rowCount);
        LOGGER.info("searchPhrase: {}", searchPhrase);
        LOGGER.info("sortBy: {}", sortBy);
        LOGGER.info("sortDirection: {}", sortDirection);

        long totalCount = service.searchCountMembers(member, operator);

        LOGGER.info("totalCount: {}", totalCount);

        return new DataContainer(current, rowCount, totalCount, (long) Math.ceil(totalCount / rowCount) + 1, service.searchMembers((current - 1) * rowCount, rowCount, member, sortBy, sortDirection, operator));
    }

}